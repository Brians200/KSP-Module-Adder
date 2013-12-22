package config.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileFixer {
	public static void attemptFix(String filePath)
	{
		//This attempts to fix a file by:
		//commenting out lines that aren't block starts or assignments (a few stock files have lines that should be comments but don't start with //)
		//closing unclosed braces, obviously, it will have to blindly close them
		//adding a new line to the end of the file
		try {
			Scanner file = new Scanner(new File(filePath));
			StringBuilder builder = new StringBuilder();
			String nextLine = "";
			int openBraces = 0;
			
			while(file.hasNextLine() || !nextLine.equals(""))
			{
				String line = (!nextLine.equals(""))? nextLine : file.nextLine().trim();
				
				nextLine = "";
				
				if(line.equals(""))
				{
					builder.append("\n");
				}
				else if(line.startsWith("//") || line.startsWith("!"))
				{
					//comment or mmremove line
					builder.append(line);
					builder.append("\n");
				}
				else if(line.contains("="))
				{
					//assignment
					builder.append(line);
					builder.append("\n");
				}
				else if(line.contains("{"))
				{
					openBraces ++;
					builder.append(line);
					builder.append("\n");
				}
				else if(line.contains("}"))
				{
					openBraces --;
					builder.append(line);
					builder.append("\n");
				}
				else
				{
					//check to see if the next line is a brace, if not, this line needs to be a comment
					
					if(!file.hasNextLine())
					{
						builder.append("//");
						builder.append(line);
						builder.append("\n");
					}
					else
					{
						nextLine = file.nextLine();
						if(nextLine.contains("{"))
						{
							//this is a module, leave it alone
							builder.append(line);
							builder.append("\n");
						}
						else
						{
							//this is an invalid line, so lets comment it out...
							builder.append("//");
							builder.append(line);
							builder.append("\n");
						}
					}
				}
			}
			
			//attempt to close unopened braces
			for(int i=0; i<openBraces;i++)
			{
				builder.append("}\n");
			}
			
			builder.append("\n");
			file.close();
			
			PrintWriter out = new PrintWriter(filePath);
			out.print(builder.toString());
			out.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO: Proper error handling
			throw new RuntimeException(e);
		}
	}
}

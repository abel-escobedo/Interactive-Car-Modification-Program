package Encapsulation;
import javax.swing.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Car car = new Car("Volkswagen", "Jetta", 2017);
		
		int yes_no;	
		//show specifics and prompt user
		yes_no = JOptionPane.showConfirmDialog(
				null,
				car.getCarDetails() +"\nDo you wish to make any changes to your car?",
				"~Car's specifics~",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
		
		Object[] options = {"Make", "Model", "Year", "I changed my mind"}; //these are our button labels
		int rage = 0;
		while(yes_no == JOptionPane.YES_OPTION)
		{
			String dumb = "Fucking dumbass, you wrote nothing.";
			
			//prompts change
			int choice = JOptionPane.showOptionDialog(
					null,
					"What changes do you wish to make?",
					"~Choose aspect to be changed~",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					options,
					null); //don't highlight any options
			
			//change Make
			if(choice == 0)
			{
				String newMake = "";
				int error = 0;
				do
				{
					if(error != 0)
					{
						JOptionPane.showMessageDialog(
								null,
								dumb,
								"idiot.",
								JOptionPane.ERROR_MESSAGE);
					}
					
					newMake = JOptionPane.showInputDialog(
							null,
							"Enter new Make:", 
							"~New Make~", 
							JOptionPane.PLAIN_MESSAGE);
					
					if(newMake.isEmpty() && newMake.isBlank())
					{
						error++;
					}
				}while(newMake.isEmpty() || newMake.isBlank());
				
				car.setMake(newMake);
			}
			
			//change Model
			else if(choice == 1)
			{
				String newModel = "";
				int error = 0;
				do
				{
					if(error != 0)
					{
						JOptionPane.showMessageDialog(
								null,
								dumb,
								"idiot.",
								JOptionPane.ERROR_MESSAGE);
					}
					
					newModel = JOptionPane.showInputDialog(
							null,
							"Enter new Model:", 
							"~New Model~", 
							JOptionPane.PLAIN_MESSAGE);
					
					if(newModel.isEmpty() || newModel.isBlank())
					{
						error++;
					}
				}while(newModel.isEmpty() || newModel.isBlank());
				
				car.setModel(newModel);
			}
			
			//change Year
			else if(choice == 2)
			{
				String messages[] = {
						"Hold it cowboy that's no number, get it together pal!",
						"Again bro? Come one lets try this again...",
						"...You can't be for real can you? Let's do this one more time",
						"Ok... this is beyond me, please seek professional help."};
				int i = 0;
				boolean valid = false;
				while(i < messages.length && !valid)
				{
					String newYearStr = JOptionPane.showInputDialog(
							null,
							"Enter new year:",
							"~New Year~",
							JOptionPane.PLAIN_MESSAGE);
					
					if(newYearStr != null && !newYearStr.isBlank())
					{
						try
						{
							int newYear = Integer.parseInt(newYearStr);
							car.setYear(newYear);
							valid = true;
						}
						catch (NumberFormatException e)
						{
							JOptionPane.showMessageDialog(
									null,
									messages[i]);
							i++;
							if(i == 3)
							{
								rage = 1;
								yes_no = 1;
							}
						}
					}
				}
			}
			else if(choice == 3)
			{
				JOptionPane.showMessageDialog(
						null, 
						"Why click yes to begin with?",
						"~bruh~",
						JOptionPane.WARNING_MESSAGE);
				rage = 1;
				yes_no = 1;
			}
			else if(choice == -1)
			{
				JOptionPane.showMessageDialog(
						null,
						"the 'x' was not meant to be an option you imbecile.\n"
						+ "Get the fuck out of my face!",
						"~Who the fuck told you to press that?",
						JOptionPane.ERROR_MESSAGE);
				rage = 1;
				yes_no = 1;
			}
			if(rage != 1)
			{
				yes_no = JOptionPane.showConfirmDialog(
						null,
						car.getCarDetails() +"\nDo you wish to make any changes to your car?",
						"~Car's specifics~",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
			}
		}
		
		if(rage != 1) 
		{
			JOptionPane.showMessageDialog(
					null,
					"Got it g, that's a sweet thing you ride!\n\n"
				+	car.getCarDetails(),
					"~Keep that ass bouncy bro <3~",
					JOptionPane.PLAIN_MESSAGE);
		}
	}
}

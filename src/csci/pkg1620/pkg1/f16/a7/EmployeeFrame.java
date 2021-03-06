/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci.pkg1620.pkg1.f16.a7;

/**
 *
 * @author Matt
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class EmployeeFrame extends JFrame
{
	private final EmployeeManager em;
	
	//Components for Adding Employee
	private final JComboBox<String> employeeTypeCombo;
	private final JTextField firstField;
	private JTextField lastField;
	private JComboBox<Character> middleCombo;
	private JComboBox<Character> genderCombo;
	private final JTextField employeeNumberField;
	private JRadioButton fullTimeRadio;
	private JRadioButton partTimeRadio;
	private JTextField amountField;
	private JButton addEmployeeButton;
	
	//Components for Remove Employee
	private JTextField employeeNumberRemoveField;
	private JButton removeButton;
	
	//Components for Updating Employee
	private JTextField employeeNumberUpdateField;
	private JTextField amountUpdateField;
	private JButton updateHourlyButton;
	private JButton updateCommissionButton;
	private JButton updateFromFileButton;
	
	//Components for Financial Options
	private JButton payoutButton;
	private JButton bonusButton;
	private JButton raisesButton;
	private JButton resetWeekButton;
	
	//Components for Vacation Request
	private JButton viewRequestButton;
	private JButton addRequestButton;
	private JButton grantRequestButton;
	
	//Management Panel
	private JButton sortPrintButton;
	private JButton printHourlyButton;
	private JButton printSalaryButton;
	private JButton printCommissionButton;
	private JButton findButton;
	private JButton exitButton;
	
	private final JTextArea console;
	
	public EmployeeFrame()
	{
		super("Employee Manager");
		setLayout(new FlowLayout());
		
		//Create EmployeeManager
                em = new EmployeeManager();
		//Create ButtonHandler
		ButtonHandler handler = new ButtonHandler();
		//ADD EMPLOYEE PANEL
		JPanel addPanel = new JPanel();
                addPanel.setSize(100, addPanel.getHeight());
               // addPanel.setLayout(new FlowLayout());
                addPanel.setBorder(BorderFactory.createLineBorder(Color.black));
                String[] typeArray = { "Hourly", "Salary", "Commission" };
                employeeTypeCombo = new JComboBox(typeArray);
                addPanel.add(employeeTypeCombo);
                employeeNumberField = new JTextField();
                employeeNumberField.setSize(5, employeeNumberField.getHeight());
                String employeeNumberFieldDefaultText = "Emp #";
              //  employeeNumberField.setText(employeeNumberFieldDefaultText);
                employeeNumberField.setForeground(Color.LIGHT_GRAY);
                addPanel.add(employeeNumberField);
                firstField = new JTextField();
                firstField.setSize(15, firstField.getHeight());
                String firstFieldDefaultText = "adfasdfasdlfkjsdlfk";
           //     firstField.setText(firstFieldDefaultText);
                firstField.setForeground(Color.LIGHT_GRAY);
                addPanel.add(firstField);
                add(addPanel);
                
		//REMOVE EMPLOYEE PANEL

		//UPDATE PANEL
		
		//FINANCIAL PANEL

		//VACATION PANEL

		//CONSOLE PANEL
		JPanel consolePanel = new JPanel();
		consolePanel.setLayout(new FlowLayout());
		console = new JTextArea(20, 100);
		console.setEditable(false);
		JScrollPane consoleScrollPane = new JScrollPane(console);
		consolePanel.add(consoleScrollPane);
		add(consolePanel);
		
		//Management PANEL

		if(em.loadEmployees("employees.ser", "requests.dat"))
			console.append("Employees Loaded\n");
		else
			console.append("Employees Not Loaded\n");
	}
	
	private Character[] createMiddleOptions()
	{
		Character[] ret = new Character[26];
		for(int i = 0; i < 26; i++)
			ret[i] = (char)(i+65);
		
		return ret;
	}
	
	//inner class for ActionListener
	private class ButtonHandler implements ActionListener
	{

                @Override
		public void actionPerformed(ActionEvent event)
		{
			//EVENT HANDLER CODE HERE
		}
        }
}

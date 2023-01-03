package staffProject;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.text.DateFormat;///new

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.*;

//import javax.swing.JFormattedTextField;

import oracle.sql.DATE;




public class staffFrame extends JFrame {

	//items for navigationPanel
	private JPanel navigationPanel;
	private JButton previousButton;
	private JLabel recordLabel;
	private JTextField indexTextField;
	private JLabel ofLabel;
	private JTextField maxTextField;
	private JButton nextButton;
	
	//items for the detailsPanel
	private JPanel detailPanel;
	private JLabel staffIDLabel;
	private JTextField staffIDTextField;
	private JLabel firstNameLabel;
	private JTextField firstNameTextField;
	private JLabel lastNameLabel;
	private JTextField lastNameTextField;
	private JLabel dobLabel;
	private JTextField dobTextField;
	private JLabel departmentLabel;
	private JTextField departmentTextField;
	private JLabel salaryLabel;
	private JTextField salaryTextField;
	private JLabel hiredateLabel;
	private JTextField hiredateTextField;
	private JLabel fulltimeLabel;
	private JTextField fulltimeTextField;
	
	
	//items for the search panel
		/*private JPanel searchNamePanel;
		private JLabel searchNameLabel;
		private JTextField searchNameTextField;*/
	//searchNamePanel=new JPanel();
	//searchNamePanel=new JPanel();
	
	private JPanel searchNamePanel;
	private JPanel searchDepartmentPanel;;
	private JLabel searchFirstNameLabel;
	private JTextField searchFirstNameTextField;
	private JTextField searchLastNameTextField;
	private JLabel searchLastNameLabel;
	private JTextField searchDepartmentTextField;
	private JLabel searchDepartmentLabel;
	
	/*searchNamePanel = new JPanel();
	searchfirstNameLabel = new JLabel("First Name");
	searchfirstNameTextField = new JTextField(10);
	searchlastNameLabel = new JLabel("Last Name");
	searchlastNameTextField = new JTextField(10);
	keyWordButton = new JButton("Search");*/
	
		
	
	
	
	private JButton keyWordButton;
	private JButton keyWordButton1;
	
	//private JPanel searchPanel;
	//private JLabel keyWordLabel1;
	//private JTextField keyWordTextField1;
	
	//private JPanel searchDepartmentPanel;
	//private JTextField searchDepartmentTextField;
	//private JLabel searchDepartmentLabel;
	//private JButton keyWordButton1;
	
	
	//create titled border for the searchName panel
	
	//private JLabel keyWordLabel;
		//private JButton keywordButton;
		//private JButton keywordButton1;

	//last 2 buttons
	private JButton insertButton;
	private JButton viewAllButton;
	
	//items for Database
	private staffQueries db; 		//database
	private staff currentStaff; //store the product that 
	//private ArrayList<department> dresults;								//is currently being displayed
	private ArrayList<staff> results; //store the items coming back 
									// from the database
	private int numberOfEntries; 	//store number of products in list
	private int currentEntryIndex; //index of product currently 
									//being displayed
	
	public staffFrame(){
		super("Staff");
		setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
		
		//connect to the Database
		db = new staffQueries();
		
		results = new ArrayList<staff>();
		//results = db.getAllstaff();
	
		//initialise the items for the navigationPanel
		navigationPanel = new JPanel();
		previousButton = new JButton("Previous");
		recordLabel = new JLabel("Record");
		indexTextField = new JTextField(2);
		ofLabel = new JLabel("of");
		maxTextField = new JTextField(2);
		nextButton = new JButton("Next");
		
		//add items to the navigationPanel
		navigationPanel.setLayout(new BoxLayout(navigationPanel,BoxLayout.X_AXIS));
		navigationPanel.add(previousButton);
		navigationPanel.add(Box.createHorizontalStrut(10));
		navigationPanel.add(recordLabel);
		navigationPanel.add(Box.createHorizontalStrut(10));
		navigationPanel.add(indexTextField);
		navigationPanel.add(Box.createHorizontalStrut(10));
		navigationPanel.add(ofLabel);
		navigationPanel.add(Box.createHorizontalStrut(10));
		navigationPanel.add(maxTextField);
		navigationPanel.add(Box.createHorizontalStrut(10));
		navigationPanel.add(nextButton);
		
		
		//disable the next and previous buttons
		nextButton.setEnabled(false);
		previousButton.setEnabled(false);
		
		add(navigationPanel);
		
		//initialise the items for the detailsPanel
		detailPanel = new JPanel();
		staffIDLabel = new JLabel("Staff ID:");
		staffIDTextField = new JTextField(5);
		staffIDTextField.setEditable(false);
		firstNameLabel = new JLabel("First Name:");
		firstNameTextField = new JTextField(5);
		lastNameLabel = new JLabel("Last Name:");
		lastNameTextField = new JTextField(5);
		dobLabel = new JLabel("Date of Birth:");
		dobTextField = new JTextField(5);
		departmentLabel = new JLabel("Department:");
		departmentTextField = new JTextField(5);
		salaryLabel = new JLabel("Salary:");
		salaryTextField = new JTextField(5);
		hiredateLabel = new JLabel("Hire Date:");
		hiredateTextField = new JTextField(5);
		
		
		//hiredateTextField.
		fulltimeLabel = new JLabel("Full Time:");
		fulltimeTextField = new JTextField(5);
		
		//add items to details panel
		detailPanel.setLayout(new GridLayout(10,5,10,10));
		detailPanel.add(staffIDLabel);
		detailPanel.add(staffIDTextField);
		detailPanel.add(firstNameLabel);
		detailPanel.add(firstNameTextField);
		detailPanel.add(lastNameLabel);
		detailPanel.add(lastNameTextField);
		detailPanel.add(dobLabel);
		detailPanel.add(dobTextField);
		detailPanel.add(departmentLabel);
		detailPanel.add(departmentTextField);
		detailPanel.add(salaryLabel);
		detailPanel.add(salaryTextField);
		detailPanel.add(hiredateLabel);
		detailPanel.add(hiredateTextField);
		detailPanel.add(fulltimeLabel);
		detailPanel.add(fulltimeTextField);
		
		add(detailPanel);
		
		//add items to details panel
				detailPanel.setLayout(new GridLayout(8,5,10,10));
				detailPanel.add(staffIDLabel);
				detailPanel.add(staffIDTextField);
				detailPanel.add(firstNameLabel);
				detailPanel.add(firstNameTextField);
				detailPanel.add(lastNameLabel);
				detailPanel.add(lastNameTextField);
				detailPanel.add(dobLabel);
				detailPanel.add(dobTextField);
				detailPanel.add(departmentLabel);
				detailPanel.add(departmentTextField);
				detailPanel.add(salaryLabel);
				detailPanel.add(salaryTextField);
				detailPanel.add(hiredateLabel);
				detailPanel.add(hiredateTextField);
				detailPanel.add(fulltimeLabel);
				detailPanel.add(fulltimeTextField);
				
			//	add(detailPanel);
		//initalise the items for the searchPanel
		searchNamePanel = new JPanel();
		searchFirstNameLabel = new JLabel("First Name");
		searchFirstNameTextField = new JTextField(10);
		searchLastNameLabel = new JLabel("Last Name");
		searchLastNameTextField = new JTextField(10);
		
		keyWordButton = new JButton("Search");
		
		
		//create titled border for the panel
		searchNamePanel.setBorder(
				BorderFactory.createTitledBorder("Search for a Staff member"));
		
		searchNamePanel.setLayout(
				new BoxLayout(searchNamePanel,BoxLayout.X_AXIS));
		
		searchNamePanel.add(Box.createHorizontalStrut(5));
		searchNamePanel.add(searchFirstNameLabel);
		searchNamePanel.add(Box.createHorizontalStrut(10));
		searchNamePanel.add(searchFirstNameTextField);
		searchNamePanel.add(Box.createHorizontalStrut(10));
		searchNamePanel.add(searchLastNameLabel);
		searchNamePanel.add(Box.createHorizontalStrut(10));
		searchNamePanel.add(searchLastNameTextField);
		searchNamePanel.add(Box.createHorizontalStrut(10));
		searchNamePanel.add(keyWordButton);
		searchNamePanel.add(Box.createHorizontalStrut(5));
		add(searchNamePanel);
		
		
		searchDepartmentPanel=new JPanel();
		
		searchDepartmentLabel = new JLabel("Department");
	    searchDepartmentTextField = new JTextField(10);
		keyWordButton1 = new JButton("Search");
		
		
		searchDepartmentPanel.setBorder(
				BorderFactory.createTitledBorder("Search Department"));
		
		searchDepartmentPanel.setLayout(new BoxLayout(searchDepartmentPanel,BoxLayout.X_AXIS));
		
		
		
		//search Department panel
		searchDepartmentPanel.add(Box.createHorizontalStrut(10));
		searchDepartmentPanel.add(searchDepartmentLabel);
		searchDepartmentPanel.add(Box.createHorizontalStrut(10));
		searchDepartmentPanel.add(searchDepartmentTextField);
		searchDepartmentPanel.add(Box.createHorizontalStrut(10));
		searchDepartmentPanel.add(keyWordButton1);

		
		
		add(searchDepartmentPanel);
		
		//initialise the last 2 buttons
		viewAllButton = new JButton("View All");
		insertButton = new JButton("Insert");
		add(viewAllButton);
		add(insertButton);
		
		//add the listeners
		previousButton.addActionListener(
					new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent e) {
							
							previousButtonPressed(e);
							//previousButton.setEnabled(false);
							
						}
						
					}
				);
		
		nextButton.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						
						nextButtonPressed(e);
						
					}
					
				}
			);
		
		
		keyWordButton.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						
						keyWordButtonPressed(e);
						
					}
					
				}
			);
		
		
		keyWordButton1.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent d) {
						
						keyWordButton1Pressed(d);
						
					}

					
					
				}
			);
		
		
		
		insertButton.addActionListener(
				new ActionListener(){

					@Override 
					public void actionPerformed(ActionEvent e) {
						
						insertButtonPressed(e);
						
					}
					
				}
			);
		
		viewAllButton.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						
						viewAllButtonPressed(e);
						
					}
					
				}
			);
		
		indexTextField.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						
						indexTextFieldChanged(e);
						
					}
					
				}
			);
		
		
		addWindowListener(new WindowAdapter(){
			
			@Override
			public void windowClosed(WindowEvent e){
				
				db.close();
				System.exit(0);
				
			}
		});
		
		
		//settings for the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(480,550);
		//setSize(550,650);
		setResizable(false);
		setVisible(true);
		
	}
	
	public void previousButtonPressed(ActionEvent e){
		//JOptionPane.showMessageDialog(this, "Previous Button Pressed");
		currentEntryIndex--;
		if(currentEntryIndex <0){
			currentEntryIndex = numberOfEntries -1;
		}
		
		indexTextField.setText((currentEntryIndex+1)+"");
		indexTextFieldChanged(e);
	}
	
	public void nextButtonPressed(ActionEvent e){
		//JOptionPane.showMessageDialog(this, "Next Button Pressed");
		currentEntryIndex++;
		if(currentEntryIndex >= numberOfEntries){
			
			currentEntryIndex = 0;
			//nextButton.setEnabled(false);
		}
		indexTextField.setText((currentEntryIndex+1)+"");
		indexTextFieldChanged(e);
	}
	
	
	
	
	public void keyWordButtonPressed(ActionEvent e){
		//JOptionPane.showMessageDialog(this, "Keyword Button Pressed");
		
		try {
			results = db.searchStaff(searchFirstNameTextField.getText(),searchLastNameTextField.getText());
			numberOfEntries = results.size();
			
			if (numberOfEntries != 0){
				//set index to 0
				currentEntryIndex = 0;
				//get the first list in the list
				currentStaff = results.get(currentEntryIndex);
				
				//display that item in the GUI
				staffIDTextField.setText(
						currentStaff.getStaffID()+"");
				firstNameTextField.setText(
						currentStaff.getFirstName());
				lastNameTextField.setText(
						currentStaff.getLastName());
				dobTextField.setText(
						currentStaff.getDateOfBirth()+"");
				departmentTextField.setText(
						currentStaff.getDepartment()+"");
				salaryTextField.setText(
						currentStaff.getSalary()+"");
				hiredateTextField.setText(
						currentStaff.getStartDate()+"");
				fulltimeTextField.setText(
						currentStaff.getFullTime()+"");
			maxTextField.setText(numberOfEntries+"");
			indexTextField.setText((currentEntryIndex+1)+ "");
			previousButton.setEnabled(true);
			nextButton.setEnabled(true);
			
			} else {
				//if no matching products were found
				JOptionPane.showMessageDialog(this,
						"No Matching staff member found! - now displaying all staff");
				viewAllButtonPressed(e);
			}
			
		} catch (Exception ex){
			System.out.println("System not available at present");
			ex.printStackTrace(); //for debugging
		}
		
		RefreshNames();//Clear name fields after search
	}
	
	
	
	
	
	public void keyWordButton1Pressed(ActionEvent d){
		//JOptionPane.showMessageDialog(this, "Keyword Button Pressed"
		
		try {
			
			results = db.searchStaffDepartment(searchDepartmentTextField.getText());
			numberOfEntries = results.size();
			
			if (numberOfEntries != 0){
				//set index to 0
				currentEntryIndex = 0;
				//get the first list in the list
				currentStaff = results.get(currentEntryIndex);
				
				//display that item in the GUI
				staffIDTextField.setText(
						currentStaff.getStaffID()+"");
				firstNameTextField.setText(
						currentStaff.getFirstName());
				lastNameTextField.setText(
						currentStaff.getLastName());
				dobTextField.setText(
						currentStaff.getDateOfBirth()+"");
				departmentTextField.setText(
						currentStaff.getDepartment()+"");
				salaryTextField.setText(
						currentStaff.getSalary()+"");
				hiredateTextField.setText(
						currentStaff.getStartDate()+"");
				fulltimeTextField.setText(
						currentStaff.getFullTime()+"");
			maxTextField.setText(numberOfEntries+"");
			indexTextField.setText((currentEntryIndex+1)+ "");
			previousButton.setEnabled(true);
			nextButton.setEnabled(true);
				
			} else {
				//if no matching products were found
				JOptionPane.showMessageDialog(this, 
					"No Matching products found! - now displaying all products");
				viewAllButtonPressed(d);
			}	
			
			
		}catch (Exception ex){
		System.out.println("System not available at present");
		ex.printStackTrace(); //for debugging
	}
		RefreshDept();//Clear department field after search
	}

	
	//@SuppressWarnings("deprecation")
	public void insertButtonPressed(ActionEvent e){
		//JOptionPane.showMessageDialog(this, "Insert Button Pressed");
		try {
			
			int result = db.addStaff(
					firstNameTextField.getText(),
					lastNameTextField.getText(),
					Date.valueOf(dobTextField.getText()),
					departmentTextField.getText(),
					Double.parseDouble(salaryTextField.getText()),
					Date.valueOf(hiredateTextField.getText()),
					Boolean.parseBoolean(fulltimeTextField.getText()));
					//Integer.parseInt(qtyInStockTextField.getText()));
			//check if the record inserted properly
			if(result == 1){
				JOptionPane.showMessageDialog(this, "Staff member Added");
				//show all products
				viewAllButtonPressed(e);
			}else{
				
				JOptionPane.showMessageDialog(this, "Staff member not added");
			}
		} catch (Exception ex){
			
			System.out.println("Something went wrong!");
			ex.printStackTrace();
		}
		Refresh();//Clear all fields after search
	}
	
	
	private void RefreshNames() {
		searchFirstNameTextField.setText("");
		searchLastNameTextField.setText("");
	    
}
	
	private void RefreshDept() {
		searchDepartmentTextField.setText("");
		
}

	
	private void Refresh() {
	    staffIDTextField.setText("");
	    firstNameTextField.setText("");
	    lastNameTextField.setText("");
	    dobTextField.setText("");
	    departmentTextField.setText("");
	    salaryTextField.setText("");
	    hiredateTextField.setText(""); 
	    fulltimeTextField.setText("");
}
	public void viewAllButtonPressed(ActionEvent e){
		//JOptionPane.showMessageDialog(this, "View All Button Pressed");
	
		try {
			results = db.getAllstaff();
			numberOfEntries = results.size();
			
			if (numberOfEntries != 0){
				//set index to 0
				currentEntryIndex = 0;
				//get the first list in the list
				currentStaff = results.get(currentEntryIndex);
				
				//display that item in the GUI
				staffIDTextField.setText(
						currentStaff.getStaffID()+"");
				firstNameTextField.setText(
						currentStaff.getFirstName());
				lastNameTextField.setText(
						currentStaff.getLastName());
				dobTextField.setText(
						currentStaff.getDateOfBirth()+"");
				departmentTextField.setText(
						currentStaff.getDepartment()+"");
				salaryTextField.setText(
						currentStaff.getSalary()+"");
				hiredateTextField.setText(
						currentStaff.getStartDate()+"");
				fulltimeTextField.setText(
						currentStaff.getFullTime()+"");
			maxTextField.setText(numberOfEntries+"");
			indexTextField.setText((currentEntryIndex+1)+ "");
			previousButton.setEnabled(true);
			nextButton.setEnabled(true);
			
			}
			
		} catch (Exception ex){
			System.out.println("System not available at present");
			ex.printStackTrace(); //for debugging
		}
	
	}
	
	public void indexTextFieldChanged(ActionEvent e){
		//JOptionPane.showMessageDialog(this, "index TextField Changed");
		
		try{
			
			currentEntryIndex = Integer.parseInt(indexTextField.getText())-1;
			//check that the index is a valid index
			if(numberOfEntries > 0 &&
					currentEntryIndex >=0 &&
					currentEntryIndex < numberOfEntries){
				currentStaff = results.get(currentEntryIndex);
				//display in the GUI
				staffIDTextField.setText(
						currentStaff.getStaffID()+"");
				firstNameTextField.setText(
						currentStaff.getFirstName());
				lastNameTextField.setText(
						currentStaff.getLastName());
				dobTextField.setText(
						currentStaff.getDateOfBirth()+"");
				departmentTextField.setText(
						currentStaff.getDepartment()+"");
				salaryTextField.setText(
						currentStaff.getSalary()+"");
				hiredateTextField.setText(
						currentStaff.getStartDate()+"");
				fulltimeTextField.setText( 
						currentStaff.getFullTime()+"");
			}
		} catch (Exception ex){
			ex.printStackTrace();//for debugging
			System.out.println("System not available at present");
		}
	}
	
	
}
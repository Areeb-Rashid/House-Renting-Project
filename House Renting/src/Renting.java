import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Renting extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) throws Exception {
        launch ();
    }

    public void start(Stage stage) throws Exception{

        ArrayList<House> listLahore = new ArrayList<House>();
        listLahore.add(new House("Lahore",20,100000));
        listLahore.add(new House("Lahore",10,1990000));
        listLahore.add(new House("Lahore",5,100000));
        listLahore.add(new House("Lahore",5,100000));

        ArrayList<House> listfsd = new ArrayList<House>();
        listfsd.add(new House("Faisalabad",20,100000));
        listfsd.add(new House("Faisalabad",10,1990000));
        listfsd.add(new House("Faisalabad",5,100000));
        listfsd.add(new House("Faisalabad",5,100000));

        stage.setTitle("House renting System");
        Group adder = new Group();
        Group adderuser = new Group();
        Group userForget = new Group();
        Group addersignUp = new Group();
        Group invalid = new Group();
        Group searchCity= new Group();
        Group changePass = new Group();
        Group createAccount = new Group();

        Scene scene = new Scene(adder,800,600);
        Scene scene2 = new Scene(adderuser,800,600);
        Scene scene3 = new Scene(userForget,800,600);
        Scene scene4 = new Scene(addersignUp,700,500);
        Scene scene5 = new Scene(invalid,800,600);
        Scene scene6 = new Scene(searchCity,700,500);
        Scene scene7 = new Scene(changePass,700,500);
        Scene scene8 = new Scene(createAccount,800,600);
        stage.setScene(scene);

        Text welcome = new Text();
        welcome.setText("Welcome, Choose how you want to login: ");
        welcome.setX(80);
        welcome.setY(200);
        welcome.fontProperty();
        welcome.setFont(Font.font("Times New Roman",25));
        welcome.setFill(Color.BLACK);
        welcome.setTextAlignment(TextAlignment.CENTER);
        adder.getChildren().add(welcome);

        Button admin = new Button("Admin login");
        admin.setLayoutX(130);
        admin.setLayoutY(250);
        admin.setFont(Font.font("Times New Roman",20));
        adder.getChildren().add(admin);

        Button user = new Button("User Login");
        user.setLayoutX(400);
        user.setLayoutY(250);
        user.setFont(Font.font("Times New Roman",20));
        adder.getChildren().add(user);

        Text welcomeUser = new Text();
        welcomeUser.setText("Welcome to User Portal");
        welcomeUser.setX(150);
        welcomeUser.setY(150);
        welcomeUser.fontProperty();
        welcomeUser.setFont(Font.font("Times New Roman",25));
        welcomeUser.setFill(Color.BLACK);
        adderuser.getChildren().add(welcomeUser);

        Text successLogin = new Text("Logged in successfully");
        successLogin.setLayoutY(50);
        successLogin.setFill(Color.GREEN);
        successLogin.setFont(Font.font("Times New Roman",20));
        successLogin.setTextAlignment(TextAlignment.CENTER);
        addersignUp.getChildren().add(successLogin);

        Text username = new Text("User Name: ");
        username.setX(150);
        username.setY(218);
        username.setFont(Font.font("Times New Roman",16));
        adderuser.getChildren().add(username);

        Text newpass = new Text("New Password:   ");
        newpass.setLayoutX(10);
        newpass.setLayoutY(-100);
        newpass.setFont(Font.font("Times New Roman",18));
        changePass.getChildren().add(newpass);

        Text createaccount = new Text("If you dont have an account");
        createaccount.setX(150);
        createaccount.setY(400);
        createaccount.setFont(Font.font("Times New Roman",16));
        adderuser.getChildren().add(createaccount);

        PasswordField newPassfield = new PasswordField();
        newPassfield.setLayoutX(150);
        newPassfield.setLayoutY(-120);
        changePass.getChildren().add(newPassfield);

        Text confirmNewPass = new Text("Confirm New Password: ");
        confirmNewPass.setLayoutX(-40);
        confirmNewPass.setLayoutY(-50);
        confirmNewPass.setFont(Font.font("Times New Roman",18));
        changePass.getChildren().add(confirmNewPass);

        PasswordField confirmnewpassfield = new PasswordField();
        confirmnewpassfield.setLayoutX(150);
        confirmnewpassfield.setLayoutY(-70);
        changePass.getChildren().add(confirmnewpassfield);

        TextField userNameField = new TextField();
        userNameField.setLayoutX(250);
        userNameField.setLayoutY(200);
        adderuser.getChildren().add(userNameField);

        Text userPass = new Text("Password: ");
        userPass.setX(150);
        userPass.setY(250);
        userPass.setFont(Font.font("Times New Roman",16));
        adderuser.getChildren().add(userPass);

        Text Invalid = new Text("Username or password is incorrect");
        Invalid.setFill(Color.RED);
        Invalid.setFont(Font.font("Times New Roman",30));
        Invalid.setX(100);
        Invalid.setY(200);
        invalid.getChildren().add(Invalid);

        Text choose = new Text("Choose what you desire");
        choose.setFont(Font.font("Times New Roman",15));
        choose.setY(90);
        choose.setX(30);
        choose.setTextAlignment(TextAlignment.CENTER);
        addersignUp.getChildren().add(choose);

        Text searchLocation = new Text("Type the name of city, where you need a house (Lahore/Faisalabad) ");
        searchLocation.setFont(Font.font("Times New Roman",20));
        searchLocation.setX(20);
        searchLocation.setY(50);
        searchLocation.setTextAlignment(TextAlignment.CENTER);
        searchCity.getChildren().add(searchLocation);

         Text searchLahore = new Text("Lahore");
         Text searchFsd = new Text("Faisalabad");
        // Text searchGojra = new Text("Gojra");

        PasswordField userPassField = new PasswordField();
        userPassField.setLayoutX(250);
        userPassField.setLayoutY(230);
        adderuser.getChildren().add(userPassField);

        TextField searchHouseField = new TextField();
        searchCity.getChildren().add(searchHouseField);
        searchHouseField.setLayoutX(180);
        searchHouseField.setLayoutY(100);


        Button usersignin = new Button("Sign-In");
        usersignin.setLayoutX(270);
        usersignin.setLayoutY(280);
        adderuser.getChildren().add(usersignin);

        Button invalidBack = new Button("Go Back");
        invalidBack.setLayoutX(100);
        invalidBack.setLayoutY(100);
        invalid.getChildren().add(invalidBack);

        Button forgetBack = new Button("Go Back");
        invalidBack.setLayoutX(100);
        invalidBack.setLayoutY(100);
        userForget.getChildren().add(forgetBack);
        

        Button forgetuser = new Button("Forget Password");
        forgetuser.setLayoutX(330);
        forgetuser.setLayoutY(280);
        adderuser.getChildren().add(forgetuser);

        Button searchByCity = new Button("Search House by City");
        searchByCity.setFont(Font.font("Times New Roman",20));
        searchByCity.setLayoutX(50);
        searchByCity.setLayoutY(120);
        addersignUp.getChildren().add(searchByCity);

        Button uploaddetails = new Button("Upload House details");
        uploaddetails.setFont(Font.font("Times New Roman",20));
        uploaddetails.setLayoutX(50);
        uploaddetails.setLayoutY(230);
        addersignUp.getChildren().add(uploaddetails);

        Button viewInfo = new Button("View House Information");
        viewInfo.setFont(Font.font("Times New Roman",20));
        viewInfo.setLayoutX(450);
        viewInfo.setLayoutY(120);
        addersignUp.getChildren().add(viewInfo);

        Button viewOwner = new Button("View Owner Profile");
        viewOwner.setFont(Font.font("Times New Roman",20));
        viewOwner.setLayoutX(450);
        viewOwner.setLayoutY(230);
        addersignUp.getChildren().add(viewOwner);

        Button editProfile = new Button("Edit Profile");
        editProfile.setFont(Font.font("Times New Roman",20));
        editProfile.setLayoutX(50);
        editProfile.setLayoutY(340);
        addersignUp.getChildren().add(editProfile);

        Button changeuserPass = new Button("Change Password");
        changeuserPass.setFont(Font.font("Times New Roman",20));
        changeuserPass.setLayoutX(450);
        changeuserPass.setLayoutY(340);
        addersignUp.getChildren().add(changeuserPass);

        Button searchhouse = new Button("Search");
        searchhouse.setLayoutX(330);
        searchhouse.setLayoutY(100);
        searchCity.getChildren().add(searchhouse);

        Button backchangePassword = new Button("Go back");
        changePass.setLayoutX(110);
        changePass.setLayoutY(250);

        Button passchangesubmit = new Button("Change Password");
        passchangesubmit.setLayoutX(150);
        passchangesubmit.setLayoutY(-30);
        changePass.getChildren().add(passchangesubmit);

        Button createaccountbutton = new Button("Click Here");
        createaccountbutton.setLayoutX(330);
        createaccountbutton.setLayoutY(385);
        adderuser.getChildren().add(createaccountbutton);

        Text Forget = new Text("Sorry for your lose :)");
        Forget.setFill(Color.RED);
        Forget.setFont(Font.font("Times New Roman",30));
        Forget.setX(100);
        Forget.setY(200);
        userForget.getChildren().add(Forget);

        // Create Account
           
            // Adding Text
        Text fname = new Text("First Name:");
        fname.setFont(Font.font("Times New Roman",20));
        fname.setX(70);
        fname.setY(90);
        createAccount.getChildren().add(fname);

        Text lname = new Text("Last Name:");
        lname.setFont(Font.font("Times New Roman",20));
        lname.setX(70);
        lname.setY(190);
        createAccount.getChildren().add(lname);

        Text pass = new Text("Enter Password:");
        pass.setFont(Font.font("Times New Roman",20));
        pass.setX(70);
        pass.setY(300);
        createAccount.getChildren().add(pass);

        Text conpass = new Text("Confirm Password:");
        conpass.setFont(Font.font("Times New Roman",20));
        conpass.setX(70);
        conpass.setY(400);
        createAccount.getChildren().add(conpass);

        // Adding TextField

        TextField createfname = new TextField();
        createfname.setLayoutX(170);
        createfname.setLayoutY(70);
        createAccount.getChildren().add(createfname);

        TextField createlname = new TextField();
        createlname.setLayoutX(170);
        createlname.setLayoutY(170);
        createAccount.getChildren().add(createlname);

        PasswordField createpass = new PasswordField();
        createpass.setLayoutX(200);
        createpass.setLayoutY(280);
        createAccount.getChildren().add(createpass);

        PasswordField createconname = new PasswordField();
        createconname.setLayoutX(230);
        createconname.setLayoutY(380);
        createAccount.getChildren().add(createconname);

        // Adding buttons of create account

        Button createsAccount = new Button("Create Account");
        createsAccount.setLayoutX(230);
        createsAccount.setLayoutY(450);
        createsAccount.setMaxWidth(100);
        createAccount.getChildren().add(createsAccount);

        // Adding Back Buttons
        Button backsearch = new Button("Go Back");
        backsearch.setLayoutX(330);
        backsearch.setLayoutY(280);
        searchCity.getChildren().add(backsearch);


        // Event Handlers
        usersignin.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionevent) {
                if(userNameField.getText().equals(createfname.getText()) && userPassField.getText().equals(createpass.getText()) ){
                    stage.setScene(scene4);
               }    
               else
               stage.setScene(scene5);
            
            }
            
        });

        forgetuser.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(scene3);
                
            }
            
        });

        user.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(scene2);
                
            }
            
        });

        invalidBack.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionevent) {
                stage.setScene(scene2);
                
            }
            
        });

        forgetBack.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionevent) {
                stage.setScene(scene2);
                
            }
            
        });

        searchByCity.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionevent) {
                stage.setScene(scene6);
                
            }
            
        });

        searchhouse.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                if(searchHouseField.getText().equals(searchLahore.getText()) ){
                    for(int i=0; i<listLahore.size(); i++){
                        System.out.println(listLahore.get(i));
                    }
                }
                if(searchHouseField.getText().equals(searchFsd.getText()) ){
                    for(int i=0; i<listLahore.size(); i++){
                        System.out.println(listfsd.get(i));
                    }
                }
            }
        });

        viewInfo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                for(int i = 0; i<4; i++){
                    System.out.println(listfsd.get(i));
                    System.out.println(listLahore.get(i));
                }
                
            }
            
        });

        changeuserPass.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(scene7);
            }
            }
            
        );

        backchangePassword.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent){
                stage.setScene(scene2);
            }
        });

        passchangesubmit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {

                if (newPassfield.getText() != userPassField.getText() ){
                    System.out.println("Password Changed Successfully ");
                    stage.setScene(scene4);
                
                }

                else
                System.out.println("Your new password can't be your old password");

            }
            
        });

        createaccountbutton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                stage.setScene(scene8);
                
            }
            
        });

        createsAccount.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("Account created Successfully");
                stage.setScene(scene2);
            }
            
        });

        backsearch.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                stage.setScene(scene4);
                
            }
            
        });

        stage.show();
    }

    @Override
    public void handle(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }}

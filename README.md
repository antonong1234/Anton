# Login System
Login is a set of a person or a user’s credential. At the very least, they consists of a username and a password. However sometimes, depending on the websites or the application, some login may include more information for better security purposes such as PIN number, two-factor authentication and/or, CAPTCHA (Completely Automated Public Turing test to different between Computers and Humans Apart).
Whereby, login system is basically an authentication system whereby it manages the connections between the users and the website’s server / database to compare and verify the users’ credentials with all other users’ credentials as well. Once a match is found and their account is verified, then, system will authenticate the users and grant them the access to their accounts or corresponding webpage.
Thus, elements in a basic login system consists of at the very least:(a) Login Page / Login Interface; (b) Login / Authentication Syste; (c) Database

Login System is very important for many reasons, such as: (a) Many websites or applications require login system, (b) Login system is crucial because it contains users’ private credential, (c) On an advanced level, logins provide a security layer between unsecured and secured activity.  Once a user logs in to a secure website, for example, all data transfers are typically encrypted. This prevents other systems from viewing or recording the data transferred from the server. 

Despite the importance of login system however, there are still common log-in problems that are faced by many users, in which among them are: 
(a) Wrong combination for a username and/or password could lead to multiple attempts or failure log-in. Especially since, combination of username and/or password are case sensitive. The stress of forgetting the combination of username/password is alleviated.
(b) Some users might forget that they have changed their password in the past, and this can lead to confusion and misbelief when they are entering the old password.
(c) Some website or application require for the users to use password containing certain symbols or uppercase letter which at times can be problematic and confusing, leading to forgetting the password.

Therefore, this project is about the basic login system whereby, the system could show and inform the users where is the mistake (whether the password is wrong or the username is wrong) and this will make login more comfortable for the users. (For example, users can just try around with the password if they are assured that their user ID is correct). On top of that, this basic login system does not necessarily require for the password to have symbols, combination of letters & numbers and/or combination of uppercase & lowercase letter for user’s better experience.

In this project also, this basic login system is not connected or querying to any databases. Instead, this project used hashmap method and by using hashmap packages to store all the users id and passwords within a hashmap, and then pull the ID and Password combinations later on during the login from that hashmap.




# Lab 01

> Aim: Introduction to lab computers

## Logging in to the lab computers
Your account name should be the first two letters of your last name followed by the first two letters for your first name, followed by the last 4 digits of your CUNYFirst ID, all lower case. For example, Chris Smith with CUNYFirstID 12345678 would log in as smch6789. Your initial password is the your CUNYFirst ID. Change this password as soon as you log in.

## Saving your work
Here two possible ways you can save the exercises to make them available to you at a later time:

#### The "H:" drive
**H: drive**: this is your private network drive that is attached to the account you used to login to your lab computer (if applicable). If you have access to this drive, then anything you place inside this drive will available to you the next time you login, regardless of which lab computer you use. 

#### Secure Copy Protocol
The `scp` linux command is useful when you want to copy a file/folder from a remote server to your local computer, or vice versa. Recently, this command has been made available to the Windows Powershell!
##### **Usage examples**

The general format of using this command is the following:
```
scp [options] <from> <to>
```

The following example copies from a remote server a file called `file.txt` to a local directory on your machine:
```
scp username@remote_server:/path/to/file.txt /local/directory/
```

Notice the `-r` option specified at the beginning of the example. This means that the folder `my_folder` will be copied to the directory `home` on the remote machine:
```
scp -r /local/directory/my_folder username@remote_server:/path/to/home
```

##### Practice

1. You can use your Mars (or Venus) account to store your lab exercises so that you can refer back to them at a later point. First, make sure you can login to your account by opening up the Windows PowerShell and entering in the following into that PowerShell window:
```
ssh <username>@mars.cs.qc.cuny.edu
```
**Note**: Your username is the first two letters of your *last* name, followed by the first two letters of your *first* name, finally followed by the *last* four numbers of your CUNYID. The password to your account is your entire CUNYID.

2. If you were able to login to your account, then you have somewhere to store your projects! To test copying to and from your account on the Mars server, open up a new PowerShell and change directory to your computers desktop by entering in the following:
```
cd ~/Desktop
```

3. Create a folder on your desktop called `test_folder`.

4. Create an empty text file called `test.txt.` inside `test_folder`.

5. Enter into the new PowerShell window the following command:
```
scp -r test_folder <username>@mars.cs.qc.cuny.edu:~/
```

This should prompt you for your Mars account password, which is your CUNYID.

**Note**: the squigly line (called the *tilde*) means the *home* directory of that user on that machine.

6. To test whether `test_folder` was successfully copied to the server, let's see if we can retrieve it. Delete `test_folder` from your desktop and enter in the following:
```
scp -r <username>@mars.cs.qc.cuny.edu:~/test_folder ./
```
**Note**: The period of the `<to>` location denotes the directory the PowerShell window was *opened* in.

7. Take a look inside `test_folder` on your desktop. It should still contain `test.txt`!

8. Refer back to this lab if you need to copy code from/to your Mars account!
# Problem
There is a website running at http://2018shell.picoctf.com:21579 (link). Try to see if you can push their buttons

# Solution
I clicked the first link given, once clicked I got shown (Button1) so I push that, once pushed I got shown (Button2), after pushing button2 I get directed to a (Access Denied) site; a "meme" video was shown.
After inspecing the websites I found that the first site had a req method (post), second site (get), third site (post). After seeing that I tried to send a post req to button2.php: I used cURL to send the post req to button2.php, once sent I got the flag.

# Flag
picoCTF{button_button_whose_got_the_button_ed306c10}

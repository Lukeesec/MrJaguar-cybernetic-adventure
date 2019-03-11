# Problem
There is a website running at http://2018shell.picoctf.com:52135 (link). Do you think you can log us in? Try to see if you can login!

# Solution
I started to look around the webstite and found the admin login section. I tried entering in the good ol admin admin, but to no preveal.
Since the section we are in is 'Web exploitation', I looked up SQL injection and from there I found a very cool interactive site that explains it very well.
I ended up figuring out how to login using the chars " ' or 1=1--' LIMIT 1 "
Link to site "https://www.hacksplaining.com/exercises/sql-injection#/"

# Flag
picoCTF{con4n_r3411y_1snt_1r1sh_8cf1b7e7}

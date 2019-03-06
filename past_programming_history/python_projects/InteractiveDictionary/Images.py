import os

from PIL import Image

# C:\Users\lukem\OneDrive\Desktop\imgs

os.path.abspath('C:\Users\lukem\OneDrive\Desktop\imgs\black')

myImage = Image.open("C:/Users/lukem/OneDrive/Desktop/imgs/black.jpg");
myImage.show();



myImage = Image.open("C:/Users/lukem/OneDrive/Desktop/imgs/black.jpg")
ph = ImageTk.PhotoImage(myImage)
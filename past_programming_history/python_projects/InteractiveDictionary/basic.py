import json
import tkinter as tk
from difflib import get_close_matches

data = json.load(open("data.json"))


def translate(word):
    if word.isupper():
        word = word.upper()
    else:
        word = word.lower()

    if word in data:
        for i in data[word]:
            print(i)
    elif len(get_close_matches(word, data.keys())) > 0:
        matches = get_close_matches(word, data.keys(), cutoff=0.8)[0]

        root = tk.Tk()
        root.withdraw()

        def exit_application():
            MsgBox = tk.messagebox.askquestion("Word was not found.", "Nearest match is %s, is that correct?" % matches,
                                               icon="question")
            if MsgBox == 'yes':
                for i in data[matches]:
                    print(i)
                root.destroy()
            else:
                tk.messagebox.showinfo('Return', 'You will now return to the application screen')
                root.destroy()

        exit_application()
        root.mainloop()

    else:
        print("%s not found" % word)


master = tk.Tk()


# Create this method before you create the entry
def return_entry(eh):
    # Gets and prints the content of the entry
    content = entry.get()
    # Takes the input from the user and uses it as a arg in the translate function
    output = translate(content)

    if type(output) == list:
        for item in output:
            print(item)
        else:
            print(output)


tk.Label(master, text="Input the word you would like defined", font="Times").grid(row=0, sticky=tk.W)

# Entry from the person
entry = tk.Entry(master)
# Grid size
entry.grid(row=0, column=1)

# Connect the entry with the return button
entry.bind('<Return>', return_entry)

tk.mainloop()

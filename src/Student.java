class Student {
    String firstName;
    String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        final Student e = (Student) o;

        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName);
    }

    public String toString() {
        return firstName +  " " + lastName;
    }
}
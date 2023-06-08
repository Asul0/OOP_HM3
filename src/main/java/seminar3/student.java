package seminar3;


//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode

class Student {
    private Long id;
    private String fullName;

    public Student(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
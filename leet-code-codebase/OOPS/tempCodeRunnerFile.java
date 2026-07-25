class objectMaking {
    int id;
    String name;

    public objectMaking(int id, String name) {
        this.id = id;
        this.name = name;
    }

    boolean equalName(String name) {
        return this.name == name;
    }

    public static void main(String[] args) {
        objectMaking student1 = new objectMaking(1, "Pragati");
        objectMaking student2 = new objectMaking(2, "Pragati");
        System.out.println(student1.equals(student2));
        System.out.println(student1 == student2);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        objectMaking other = (objectMaking) obj;

        return name.equals(other.name);
    }
}
package tema.patterns.ch6;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMaried;

    private Person(){};

    private Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMaried = builder.isMaried;
    }


    static public class Builder {
        private String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMaried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setDrivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder setMaried(boolean isMaried) {
            this.isMaried = isMaried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

        @Override
        public String toString() {
            return "Name: " + name + ", Job: " + job + ", University: " + university + ", Driving license: "
                    + drivingLicense + ", Is married: " + isMaried;
        }

}

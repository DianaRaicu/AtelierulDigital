package tema.generics.ch2;

public interface Shoe {
    class Running implements generics.pairs.Shoe, Shoe {
        private String color;
        private int size;

        public Running(String color, int size) {
            this.color = color;
            this.size = size;
        }
    }

    class Heels implements generics.pairs.Shoe {
        private String color;
        private int size;

        public Heels(String color, int size) {
            this.color = color;
            this.size = size;
        }
    }
}

public class Human {
        public static void main(String[] args) {
            Human human = new Human();
            human.Walk();
            human.Walk("Walking");
            human.Walk("Walking Faster",10);

        }
        public void Walk(){
            System.out.println("Human Created");

        }
        public void Walk(String a) {
            System.out.println("Human Walks");
        }
        public void Walk(String a,int b){
            System.out.println("Human Walks Faster");
        }

            }





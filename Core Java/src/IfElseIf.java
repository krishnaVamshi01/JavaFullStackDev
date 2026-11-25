public class IfElseIf {
    static void main(String[] args) {
        int age =19;
        boolean hasVoterid = true;

        if (age >=18 && hasVoterid){
            System.out.println("can Cast A Vote");
        } else if (age>=18 && !hasVoterid) {
            System.out.println("Apply for Voterid");
        } else if (age <= 18) {
            System.out.println("Underage ");
        }else{
            System.out.println("inavlid data");
        }
    }
}

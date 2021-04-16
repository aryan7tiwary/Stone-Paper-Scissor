import java.util.*;
public class stone_paper_scissor
{
        public static void main(String args[])
        {
                Scanner in = new Scanner(System.in);
                int n, computer=0, user=0;
                System.out.println("Enter the number of rounds");
                n=in.nextInt();
                int output,input;
                for(int i=1;i<=n;i++)
                {
                        System.out.println("Enter 1 for stone, 2 for paper and 3 for scissor");
                        input=in.nextInt();
                        output=(int)(Math.random()*3+0);




                        if(output==1 && input==1)
                        {
                                System.out.println("Computer also flicked Stone!");
                                continue;
                        }
                        if(output==1 && input==2)
                        {
                                System.out.println("Computer flicked Stone, you won this round!");
                                user+=user;
                        }
                        if(output==1 && input==3)
                        {
                                System.out.println("Computer flicked Stone, you lost this round");
                                computer+=computer;
                        }
                        if(output==2 && input==1)
                        {
                                System.out.println("Computer flicked Paper, you lost this round");
                                computer+=computer;
                        }
                        if(output==2 && input==2)
                        {
                                System.out.println("Computer also flicked Paper!");
                                continue;
                        }
                        if(output==2 && input==3)
                        {
                                System.out.println("Computer flicked Paper, you won this round!");
                                user+=user;
                        }
                        if(output==3 && input==1)
                        {
                                System.out.println("Computer flicked Scissor, you won this round!");
                                user+=user;
                        }
                        if(output==3 && input==2)
                        {
                                System.out.println("Computer flicked Scissor, you lost this round!");
                                computer+=computer;
                        }
                        if(output==3 && input==3)
                        {
                                System.out.println("Computer also flicked Paper");
                                continue;
                        }
                }


                if(computer>user)
                {
                        System.out.println("You lost");
                }
                if(user>computer)
                {
                        System.out.println("You won");
                }
                if(computer==user)
                {
                        System.out.println("No one won, no one lost, PERFECT!");
                }
        }
}

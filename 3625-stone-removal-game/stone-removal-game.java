class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;

        else if(n==10) return true;//Alice wins
        else if(n>10 && n<19) return true;//Bob loses
        else if(n==19) return false;//Bob wins
        else if(n>19 && n<27) return false;//Alice loses
        else if(n==27) return true;//Alice wins
        else if(n>27 && n<34) return true;//Bob loses
        else if(n==34) return false;//Bob wins
        else if(n>34 && n<40) return false;//Alice loses
        else if(n==40) return true;//Alice wins
        else if(n>40 && n<45) return true;//Bob loses
        else if(n==45) return false;//Bob wins
        else if(n>45 && n<49) return false;//Alice loses
        else if(n==49) return true;//Alice wins
        else return true;
    }
}
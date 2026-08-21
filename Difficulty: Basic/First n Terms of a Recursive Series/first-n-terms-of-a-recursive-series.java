class Solution {
    public ArrayList<Integer> gfSeries(int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int firstTerm=0;
        int secondTerm=1;
        list.add(firstTerm);
        list.add(secondTerm);
        for(int i =2;i<n;i++){
            int newTerm=(firstTerm*firstTerm) -secondTerm;
            list.add(newTerm);
            firstTerm=secondTerm;
            secondTerm=newTerm;
        }
        return list;
    }
}
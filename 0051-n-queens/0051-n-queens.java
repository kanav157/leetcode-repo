class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        boolean[] columns = new boolean[n];
        boolean[] diagonal1 = new boolean[2*n-1];
        boolean[] diagonal2 = new boolean[2*n-1];
        backtrack(n,new ArrayList<>(),result,columns,diagonal1,diagonal2);
        return result;
    }

    public void backtrack(int n, List<String> current, List<List<String>> result, boolean[] columns, boolean[] diagonal1 , boolean[] diagonal2)
    {
        if (current.size() == n)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        int row = current.size();

        for (int i = 0 ; i < n ; i++)
        {
            if (columns[i] || diagonal1[row + i] || diagonal2[row-i+n-1])
            {
                continue;
            }

            char[] boardRow = new char[n];
            Arrays.fill(boardRow,'.');
            boardRow[i] = 'Q';

            current.add(new String(boardRow));
            columns[i] = true;
            diagonal1[row+i] = true;
            diagonal2[row-i+n-1] = true;


            backtrack(n,current,result,columns,diagonal1,diagonal2);

            current.remove(current.size()-1);

            columns[i]=false;
            diagonal1[row+i] = false;
            diagonal2[row-i+n-1] = false;

        }
    }
}
class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        List<int[]> list = new ArrayList<>();
        int n = arr.length;
        
        Arrays.sort(arr, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b)
            {
                return a[0] - b[0];
            }
        });
        
        for(int i=0; i<n; i++)
        {
            if(list.size() == 0 || arr[i][0] > list.get(list.size() - 1)[1])
            {
                list.add(new int[]
                {
                    arr[i][0], arr[i][1]
                });
            }
            else
            {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], arr[i][1]);
            }
        }
        return list;
    }
}
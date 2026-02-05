class Solution {
    class Pair implements Comparable<Pair>{
        int a, b;
        Pair(int a, int b){
            this.a=a;
            this.b=b;
        }
        @Override
        public int compareTo(Pair p){
            return this.b-p.b;
        }
    }
    public int[] topKFrequent(int[] a, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int c=0;
        for(int key:map.keySet()){
            int val=map.get(key);
            if(c<k){
                pq.add(new Pair(key,val));
                c++;
            }
            else if(val<pq.peek().b)continue;
            else{
                pq.poll();
                pq.add(new Pair(key,val));
            }
        }
        int ans[]=new int[pq.size()];
        int i=0;
        while(!pq.isEmpty()){
            ans[i]=pq.poll().a;
            i++;
        }
        return ans;
    }
}
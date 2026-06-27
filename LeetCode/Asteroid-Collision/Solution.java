1class Solution {
2    public int[] asteroidCollision(int[] a) {
3        Stack<Integer> s = new Stack<>();
4        for (int x : a) {
5            boolean ok = true;
6            while (ok && x < 0 && !s.isEmpty() && s.peek() > 0) {
7                if (s.peek() < -x) {
8                    s.pop();
9                } else if (s.peek() == -x) {
10                    s.pop();
11                    ok = false;
12                } else {
13                    ok = false;
14                }
15            }
16            if (ok) s.push(x);
17        }
18        int[] r = new int[s.size()];
19        for (int i = 0; i < r.length; i++) {
20            r[i] = s.get(i);
21        }
22        return r;
23    }
24}
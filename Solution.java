class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] = new int[nums.length];
        int h = 0;
        for(int i=0;i<nums.length;i++)
        { if(i%2==0)
            { a[i] = nums[h];
                h++;
            }
            else{a[i] = nums[n];
                n++;
            }
        }
        return a;
    }
}

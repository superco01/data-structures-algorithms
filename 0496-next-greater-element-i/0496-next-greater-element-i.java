class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (found) {
                    System.out.println(nums2[j]);
                    if (nums2[j] > nums1[i]) {
                        // System.out.println("here: " + nums1[i]);
                        result[i] = nums2[j];
                        break;
                    }
                }
                if (nums1[i] == nums2[j]) {
                    found = true;
                }
            }
            // System.out.println("====");
            if (result[i] == 0) {
                result[i] = -1;
            }
        }

        return result;
    }
}
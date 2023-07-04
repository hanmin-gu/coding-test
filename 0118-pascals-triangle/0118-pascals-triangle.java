class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for(int row = 1; row < numRows; row++){
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            for(int j = 0; j < row - 1; j++){
                numbers.add(result.get(row - 1).get(j) + result.get(row - 1).get(j+1));
            }
            numbers.add(1);
            result.add(numbers);
        }
        return result;
    }
}
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0  # 왼쪽 포인터
        right = len(height) - 1  # 오른쪽 포인터
        max_area = 0  # 최대 넓이 저장 변수

        while left < right:
            # 현재 선택된 두 높이 중 작은 값 * 너비 계산
            max_area = max(max_area, min(height[left], height[right]) * (right - left))
            
            # 더 작은 쪽의 포인터를 이동 (큰 쪽을 이동하면 최적해를 놓칠 수 있음)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return max_area
        
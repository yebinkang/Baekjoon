#include <iostream>
using namespace std;

int main() {
	int x, y;
	int w, h;
	cin >> x >> y >> w >> h;

	//나갈 수 있는 거리들을 배열에 넣고 그 중에서 최솟값 구하기
	int arr[4] = { x, w - x, y, h - y };
	int min = arr[0];

	for (int i = 1; i < 4; i++) {
		if (arr[i] < min) min = arr[i];
	}

	cout << min;

	return 0;
}
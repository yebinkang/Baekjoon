#include <iostream>
using namespace std;

int main() {
	int x, y;
	int w, h;
	cin >> x >> y >> w >> h;

	//���� �� �ִ� �Ÿ����� �迭�� �ְ� �� �߿��� �ּڰ� ���ϱ�
	int arr[4] = { x, w - x, y, h - y };
	int min = arr[0];

	for (int i = 1; i < 4; i++) {
		if (arr[i] < min) min = arr[i];
	}

	cout << min;

	return 0;
}
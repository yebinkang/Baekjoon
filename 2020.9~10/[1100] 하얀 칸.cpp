#include <iostream>
using namespace std;

int main() {
	const int SIZE = 8;
	char chessBoard[SIZE][SIZE];
	int total = 0;
	
	//ü���� ���� �Է�
	for (int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			cin >> chessBoard[i][j];
		}
	}

	//�Ͼ� ĭ ���� �� ���� ����
	for (int i = 0; i < SIZE; i ++) {
		if (i % 2 == 0) {
			for (int j = 0; j < SIZE; j += 2) {
				if (chessBoard[i][j] == 'F') total++;
			}
		}
		else {
			for (int j = 1; j < SIZE; j += 2) {
				if (chessBoard[i][j] == 'F') total++;
			}
		}
	}

	cout << total;

	return 0;
}
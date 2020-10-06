#include <iostream>
using namespace std;

int main() {
	const int SIZE = 8;
	char chessBoard[SIZE][SIZE];
	int total = 0;
	
	//체스판 상태 입력
	for (int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			cin >> chessBoard[i][j];
		}
	}

	//하얀 칸 위의 말 개수 세기
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
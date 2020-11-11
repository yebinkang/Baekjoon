#include <iostream>
using namespace std;

void matrixMult(int n, int m, int k);

const int SIZE = 100;

int a[SIZE][SIZE];
int b[SIZE][SIZE];
int c[SIZE][SIZE];

int main() {

	int n, m, m2, k;
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			cin >> a[i][j];
		}
	}
	
	cin >> m2 >> k;

	for (int i = 0; i < m2; i++) {
		for (int j = 0; j < k; j++) {
			cin >> b[i][j];
		}
	}

	matrixMult(n, m, k);

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < k; j++)
			cout << c[i][j] << " ";
		cout << endl;
	}

	return 0;
}

void matrixMult(int n, int m, int k) {

	for (int h = 0; h < n; h++) {
		for (int j = 0; j < k; j++) {
			for (int i = 0; i < m; i++) {
				c[h][j] += a[h][i] * b[i][j];
			}
		}
	}
}
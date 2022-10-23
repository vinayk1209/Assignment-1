
public class Q_1 {

	public static void main(String[] args) {
		int n = 7;
		for(int i=0; i< n; i++) {
			//j loop for i
			for(int j=0; j<n; j++) {
				if(j==(n-1)/2) {
					System.out.print('*');
				} else 
					System.out.print(' ');
			}
			System.out.print("   ");
			//j loop for N
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print('*');
				} else 
					System.out.print(' ');
			}
			System.out.print("   ");
			//j loop for E
			for(int j=0; j<n; j++) {
				if(i==0 || i==(n-1)/2 || i==(n-1) || j == 0) {
					System.out.print('*');
				} else 
					System.out.print(' ');
			}
			System.out.print("   ");
			//j loop for U
			for(int j=0; j<n; j++) {
				if(j==0 && i!=n-1 || j==n-1 && i!= n-1 || i==n-1 && j!=0 && j!=n-1) { 
					System.out.print('*');
				} else 
					System.out.print(' ');
			}
			System.out.print("   ");
			//j loop for R
			for(int j=0; j<n; j++) {
				if(j==0 || i==0 && j!=n-1 || i==(n-1)/2 && j!= n-1 || j==n-1 && i!=0 && i<(n-1)/2 || j==i && i>(n-1)/2) {
					System.out.print('*');	
				} else 
					System.out.print(' ');
			}
			System.out.print("   ");
			//j loop for O
			for(int j=0; j<n; j++) {
				if(j==0 && i!=0 && i!=n-1 || j==n-1 && i!=0 && i!=n-1 || i==0 && j!=0 && j!=n-1 || i==n-1 && j!=0 && j!=n-1) {
					System.out.print('*');
				} else 
					System.out.print(' ');
			}
			System.out.print("   ");
			//j loop for N
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print('*');
				} else 
					System.out.print(' ');
			}
			System.out.println();
		}

	}

}

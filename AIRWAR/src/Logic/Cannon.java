package Logic;

public class Cannon {

		private int x_pos;
	
		private int y_pos;
	
		private int length;

		private int max_x;

		
		public Cannon(int length, int max_x, int y_pos) {
			this.length = length;
			this.max_x = max_x;
			this.y_pos = y_pos;
			
			x_pos = (max_x/2) - (length/2);
		}

		/**
		 * @return the x_pos
		 */
		public int getX_pos() {
			return x_pos;
		}

		/**
		 * @param x_pos the x_pos to set
		 */
		public void setX_pos(int x_pos) {
			if(x_pos < 0){
				x_pos = 0;
			}
			else if(x_pos > (max_x - length)){
				x_pos = max_x - length;
			}
			else{
				this.x_pos = x_pos;
			}
		}

}

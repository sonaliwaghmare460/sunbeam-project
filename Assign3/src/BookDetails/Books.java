package BookDetails;
	class Books {
		String isbn;
	    Category category;
	    double price;
	    String publishDate;
	    String authorName;
	    int quantity;

	    public Books(String isbn, Category category, double price, String publishDate, String authorName, int quantity)
	    {
	        this.isbn = isbn;
	        this.category = category;
	        this.price = price;
	        this.publishDate = publishDate;
	        this.authorName = authorName; 
	}

		public String getIsbn() {
			return isbn;
		}

		@Override
		public String toString() {
			return "Books [isbn=" + isbn + ", category=" + category + ", price=" + price + ", publishDate=" + publishDate
					+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
		}
		
	}


		



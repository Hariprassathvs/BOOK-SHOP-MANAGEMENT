System.out.println("*************COLLECTION CLASS******************");
		List<String> items=new ArrayList<>();
		System.out.println("Enter bookname Name");
		String v=sc.nextLine();
		items.add("Sherlock Holmes");
		items.add("James Bond");
		items.add("war and peace");
		items.add("time of king");
		if((Collections.binarySearch(items,v))<0)
		{
			System.out.println(v+" NAME IS NOT AVAILABLE IN OUR LIST ,,Plaese RE Enter");
		}
		else
		{
			System.out.println(v+" book is booked for Mr/Ms "+name);
		}
		System.out.println("Our other books are");
		for(int r=0;r<items.size();r++)
		{
			System.out.print(items.get(r)+"  ");
		}
		System.out.println("                           ");

package inClassDemo.statictest;

public	class	Prob4	{
    static	int	count=0;
    Prob4(){	++count;}
    public	static int	getCount(){return	count;}

    public	static	void	main(String[]	args){
        Prob4	instance	=	null;
        for(int	i =	0;	i <	10;	++i){
            instance	=	new	Prob4();
        }
//Can	use	any	instance.		Really	only	have	access	to	last	one!
        System.out.println("Number	of	instances	so	far		="+instance.getCount());
        System.out.println("Number	of	instances	so	far		="+Prob4.getCount());
    }
}

void call(){
    echo "Bhaskar Lodhi"
    add()
}

def add(){
    echo "a=4,b=89"
    def a=4
    def b=89
    def res = a+b
    echo "Addition of ${a}+${b} = ${res}"
}

import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->
    
    def course1 = new Course(title: 'Interactive Media and Animation', 
			department:'Computing',

			description:'"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer faucibus commodo odio eget fringilla. Nulla condimentum sit amet enim ac scelerisque."',

			leader:'Joe Jojo',

			code:'IMA101',

			startDate: new Date('19/01/2015'),

			endDate: new Date('19/01/2020'))

if(!course1.save()) {

		course1.errors.allErrors.each{ error ->

	println "An error occurred whilst creating course1:${error}"

}

def course2 = new Course(title: 'History of the CPU',
			
			department:'Computing',

			description:'"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer faucibus commodo odio eget fringilla. Nulla condimentum sit amet enim ac scelerisque."',

			leader:'Baby Michael',

			code:'HCP101',

			startDate: new Date('19/01/2015'),

			endDate: new Date('19/01/2020'))

if(!course2.save()) {

		course2.errors.allErrors.each{ error ->

	println "An error occurred whilst creating course2:${error}"

}
    }



def destroy= {

}

}



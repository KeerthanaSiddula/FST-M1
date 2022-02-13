class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer+" "+self.model+" "+ "is moving")

    def stop(self):
        print(self.manufacturer+" "+self.model+" "+ "has stopped")


car1 = Car("test1", "test1", "2020", "test1", "test1")
car2 = Car("test2", "test2", "2021", "test2", "test2")

car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()


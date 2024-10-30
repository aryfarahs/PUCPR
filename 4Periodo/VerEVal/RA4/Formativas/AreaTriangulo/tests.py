import unittest
from calc import area_triangulo

class TesteCalculadora(unittest.TestCase):
    def testeAreaTriangulo(self):
        self.assertEqual(area_triangulo(2, 3), 3)
        self.assertEqual(area_triangulo(4, 5), 10)
        self.assertEqual(area_triangulo(6, 7), 21)


if __name__ == '__main__':
    unittest.main()
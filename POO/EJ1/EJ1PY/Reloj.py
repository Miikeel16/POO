from datetime import datetime

class Reloj:
    def __init__(self, horas, minutos, segundos):
        self.horas = horas
        self.minutos = minutos
        self.segundos = segundos

    def __str__(self):
        return f"{self.horas:02}:{self.minutos:02}:{self.segundos:02}"

    def en_segundos(self):
        return self.horas * 3600 + self.minutos * 60 + self.segundos

    def crear_hora_con_segundos(self, segundos_totales):
        self.horas = (segundos_totales // 3600) % 24
        segundos_totales %= 3600
        self.minutos = segundos_totales // 60
        self.segundos = segundos_totales % 60

    def suma_segundos(self):
        self.crear_hora_con_segundos(self.en_segundos() + 1)

    def suma_minutos(self):
        self.crear_hora_con_segundos(self.en_segundos() + 60)

    def suma_horas(self):
        self.crear_hora_con_segundos(self.en_segundos() + 3600)

# MAIN (PARA EJECUTARLO)

if __name__ == "__main__":
    ahora = datetime.now()
    reloj = Reloj(ahora.hour, ahora.minute, ahora.second)

    print(f"Hora actual del sistema: {reloj}")

    reloj.suma_segundos()
    print(f"Después de sumar 1 segundo: {reloj}")

    reloj.suma_minutos()
    print(f"Después de sumar 1 minuto: {reloj}")

    reloj.suma_horas()
    print(f"Después de sumar 1 hora: {reloj}")

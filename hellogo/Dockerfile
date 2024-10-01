FROM golang:1.22.5-alpine AS builder
WORKDIR /app
COPY go.mod ./   
COPY . .
RUN go build -o apigo .

FROM alpine:latest
WORKDIR /root/
COPY --from=builder /app/apigo .
EXPOSE 8080
CMD ["./apigo"]

import sys
input = sys.stdin.read

def max_meetings(meetings):
    meetings.sort(key=lambda x: (x[1], x[0]))
    
    count = 0
    last_end_time = 0
    
    for start, end in meetings:
        if start >= last_end_time:
            count += 1
            last_end_time = end
    
    return count

def main():
    input_data = input().strip().split()
    n = int(input_data[0])
    meetings = []

    idx = 1
    for i in range(n):
        start = int(input_data[idx])
        end = int(input_data[idx + 1])
        meetings.append((start, end))
        idx += 2

    result = max_meetings(meetings)
    print(result)

if __name__ == "__main__":
    main()
class UnionFind:
    def __init__(self, n):
        self.parent = list(range(n + 1))
        self.rank = [0] * (n + 1)

    def find(self, u):
        if self.parent[u] != u:
            self.parent[u] = self.find(self.parent[u])
        return self.parent[u]

    def union(self, u, v):
        root_u = self.find(u)
        root_v = self.find(v)

        if root_u != root_v:
            if self.rank[root_u] > self.rank[root_v]:
                self.parent[root_v] = root_u
            elif self.rank[root_u] < self.rank[root_v]:
                self.parent[root_u] = root_v
            else:
                self.parent[root_v] = root_u
                self.rank[root_u] += 1

def kruskal(n, edges):
    edges.sort(key=lambda x: x[2])
    uf = UnionFind(n)
    total_cost = 0

    for u, v, cost in edges:
        if uf.find(u) != uf.find(v):
            uf.union(u, v)
            total_cost += cost

    return total_cost

N = int(input())
M = int(input())
edges = []

for _ in range(M):
    a, b, c = map(int, input().split())
    edges.append((a, b, c))

result = kruskal(N, edges)
print(result)
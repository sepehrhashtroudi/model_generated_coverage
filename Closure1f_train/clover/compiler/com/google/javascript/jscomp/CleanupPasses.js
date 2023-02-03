var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":135,"id":67164,"methods":[{"el":42,"sc":3,"sl":40},{"el":51,"sc":3,"sl":44},{"el":56,"sc":3,"sl":53},{"el":61,"sc":3,"sl":58},{"el":66,"sc":3,"sl":63},{"el":74,"sc":9,"sl":70},{"el":83,"sc":9,"sl":79},{"el":92,"sc":9,"sl":88}],"name":"CleanupPasses","sl":36},{"el":134,"id":67184,"methods":[{"el":108,"sc":5,"sl":106},{"el":128,"sc":5,"sl":110},{"el":133,"sc":5,"sl":130}],"name":"CleanupPasses.MemoizedScopeCleanupPass","sl":102}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1622":{"methods":[{"sl":40},{"sl":58}],"name":"testNoOptimizations2019","pass":true,"statements":[{"sl":41},{"sl":60}]},"test_398":{"methods":[{"sl":40},{"sl":44},{"sl":70}],"name":"testCleanupPassOrder654","pass":true,"statements":[{"sl":41},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":73}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [398, 1622], [398, 1622], [], [], [398], [], [398], [398], [398], [398], [398], [], [], [], [], [], [], [], [1622], [], [1622], [], [], [], [], [], [], [], [], [], [398], [], [], [398], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

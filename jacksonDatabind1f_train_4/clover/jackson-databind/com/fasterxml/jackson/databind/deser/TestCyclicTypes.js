var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":61,"id":36607,"methods":[],"name":"TestCyclicTypes","sl":11},{"el":30,"id":36607,"methods":[{"el":25,"sc":9,"sl":25},{"el":27,"sc":9,"sl":27},{"el":28,"sc":9,"sl":28}],"name":"TestCyclicTypes.Bean","sl":20},{"el":34,"id":36612,"methods":[],"name":"TestCyclicTypes.LinkA","sl":32},{"el":41,"id":36612,"methods":[{"el":39,"sc":9,"sl":39},{"el":40,"sc":9,"sl":40}],"name":"TestCyclicTypes.LinkB","sl":36},{"el":45,"id":36616,"methods":[],"name":"TestCyclicTypes.GenericLink","sl":43},{"el":48,"id":36616,"methods":[],"name":"TestCyclicTypes.StringLink","sl":47}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

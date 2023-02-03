var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":30904,"methods":[],"name":"TestTypeResolution","sl":13},{"el":15,"id":30904,"methods":[],"name":"TestTypeResolution.LongValuedMap","sl":15},{"el":17,"id":30904,"methods":[],"name":"TestTypeResolution.GenericList","sl":17},{"el":18,"id":30904,"methods":[],"name":"TestTypeResolution.GenericList2","sl":18},{"el":20,"id":30904,"methods":[],"name":"TestTypeResolution.LongList","sl":20},{"el":21,"id":30904,"methods":[],"name":"TestTypeResolution.MyLongList","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

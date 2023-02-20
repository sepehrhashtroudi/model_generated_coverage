var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":104,"id":6113,"methods":[{"el":44,"sc":3,"sl":40},{"el":50,"sc":1,"sl":47},{"el":61,"sc":1,"sl":53}],"name":"VersioningTest","sl":32},{"el":86,"id":6127,"methods":[],"name":"VersioningTest.Version1","sl":83},{"el":90,"id":6127,"methods":[],"name":"VersioningTest.Version1_1","sl":88},{"el":95,"id":6127,"methods":[],"name":"VersioningTest.Version1_2","sl":93},{"el":103,"id":6127,"methods":[],"name":"VersioningTest.SinceUntilMixing","sl":97}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":47}],"name":"testIgnoreLaterVersionClassSerialization130","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_31":{"methods":[{"sl":53}],"name":"testVersionedUntilSerialization186","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1], [1], [1], [], [], [], [31], [31], [31], [31], [31], [31], [31], [31], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

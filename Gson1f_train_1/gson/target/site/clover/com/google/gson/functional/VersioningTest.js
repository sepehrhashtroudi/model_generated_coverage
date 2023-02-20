var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":105,"id":6099,"methods":[{"el":44,"sc":3,"sl":40},{"el":50,"sc":1,"sl":47},{"el":62,"sc":1,"sl":53}],"name":"VersioningTest","sl":32},{"el":87,"id":6114,"methods":[],"name":"VersioningTest.Version1","sl":84},{"el":91,"id":6114,"methods":[],"name":"VersioningTest.Version1_1","sl":89},{"el":96,"id":6114,"methods":[],"name":"VersioningTest.Version1_2","sl":94},{"el":104,"id":6114,"methods":[],"name":"VersioningTest.SinceUntilMixing","sl":98}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_35":{"methods":[{"sl":47}],"name":"testIgnoreLaterVersionClassSerialization126","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_62":{"methods":[{"sl":53}],"name":"testVersionedGsonWithUnversionedClassesDeserialization178","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [35], [35], [35], [], [], [], [62], [62], [62], [62], [62], [62], [62], [62], [62], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

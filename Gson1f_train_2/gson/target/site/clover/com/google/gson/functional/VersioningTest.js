var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":116,"id":6082,"methods":[{"el":44,"sc":3,"sl":40},{"el":50,"sc":1,"sl":47},{"el":62,"sc":1,"sl":53},{"el":73,"sc":1,"sl":65}],"name":"VersioningTest","sl":32},{"el":98,"id":6105,"methods":[],"name":"VersioningTest.Version1","sl":95},{"el":102,"id":6105,"methods":[],"name":"VersioningTest.Version1_1","sl":100},{"el":107,"id":6105,"methods":[],"name":"VersioningTest.Version1_2","sl":105},{"el":115,"id":6105,"methods":[],"name":"VersioningTest.SinceUntilMixing","sl":109}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_114":{"methods":[{"sl":47}],"name":"testIgnoreLaterVersionClassSerialization130","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_17":{"methods":[{"sl":65}],"name":"testVersionedUntilSerialization189","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72}]},"test_204":{"methods":[{"sl":53}],"name":"testVersionedGsonWithUnversionedClassesDeserialization181","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [114], [114], [114], [], [], [], [204], [204], [204], [204], [204], [204], [204], [204], [204], [], [], [], [17], [17], [17], [17], [17], [17], [17], [17], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

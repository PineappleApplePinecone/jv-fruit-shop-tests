package core.strategy;

public interface OperationStrategy {
    OperationHandler get(Operation type);
}

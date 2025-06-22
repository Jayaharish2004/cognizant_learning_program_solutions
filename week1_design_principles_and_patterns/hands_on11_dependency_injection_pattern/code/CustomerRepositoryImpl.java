public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // Simulate DB fetch
        return new Customer(id, "Jayaharish", "harish@example.com");
    }
}
